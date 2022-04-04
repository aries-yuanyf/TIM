package com.tl.tim.server.controller;


import com.tl.tim.common.enums.StatusEnum;
import com.tl.tim.common.res.BaseResponse;
import com.tl.tim.server.api.ServerApi;
import com.tl.tim.server.api.vo.req.SendMsgReqVO;
import com.tl.tim.server.api.vo.res.SendMsgResVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/")
public class IndexController implements ServerApi {

    @Autowired
    private com.tl.tim.server.server.TIMServer TIMServer;


    /**
     * @param sendMsgReqVO
     * @return
     */
    @Override
    @RequestMapping(value = "sendMsg", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<SendMsgResVO> sendMsg(@RequestBody SendMsgReqVO sendMsgReqVO) {
        BaseResponse<SendMsgResVO> res = new BaseResponse();
        TIMServer.sendMsg(sendMsgReqVO);

        SendMsgResVO sendMsgResVO = new SendMsgResVO();
        sendMsgResVO.setMsg("OK");
        res.setCode(StatusEnum.SUCCESS.getCode());
        res.setMessage(StatusEnum.SUCCESS.getMessage());
        res.setDataBody(sendMsgResVO);
        return res;
    }

}

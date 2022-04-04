package com.tl.tim.server.api;


import com.tl.tim.server.api.vo.req.SendMsgReqVO;

/**
 *
 * @since JDK 1.8
 */
public interface ServerApi {

    /**
     * Push msg to client
     * @param sendMsgReqVO
     * @return
     * @throws Exception
     */
    Object sendMsg(SendMsgReqVO sendMsgReqVO) throws Exception;
}

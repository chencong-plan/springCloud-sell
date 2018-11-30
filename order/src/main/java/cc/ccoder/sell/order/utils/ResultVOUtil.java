package cc.ccoder.sell.order.utils;

import cc.ccoder.sell.order.vo.ResultVO;

/**
 * @author www.ccoder.cc
 * @date 2018-11-30 14:08:11
 */
public class ResultVOUtil {

    /**
     * result成功对象
     *
     * @param object 数据
     * @return 返回报文格式
     */
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}

package cc.ccoder.sell.product.utils;


import cc.ccoder.sell.product.vo.ResultVO;

/**
 * @author www.ccoder.cc
 */
public class ResultVOUtil {

    /**
     * 响应成功
     *
     * @param object 需要返回数据
     * @return 返回结果json
     */
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

}

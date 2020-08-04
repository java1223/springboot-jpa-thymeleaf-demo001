package com.offcn.pay;

import java.util.Map;

public interface PayService {

    public void createNative(String out_trade_no,String price);

    public Map queryStatus(String out_trade_no);
}

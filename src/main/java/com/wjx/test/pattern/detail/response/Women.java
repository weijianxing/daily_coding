package com.wjx.test.pattern.detail.response;

/**
 * Created by hacke on 2017/5/1.
 */
public class Women implements IWomen  {
    private int type = 0;
    private String request = "";


    public Women(int _type , String _request){
        this.type = _type;
        switch (this.type){
            case 1:
                this.request = "daughter request: " + _request;
                break;
            case 2:
                this.request = "wife request: " + _request;
                break;
            case 3:
                this.request = "mother request: " + _request;
                break;
        }
    }
    public int getType() {
        return this.type;
    }

    public String getRequest() {
        return this.request;
    }
}

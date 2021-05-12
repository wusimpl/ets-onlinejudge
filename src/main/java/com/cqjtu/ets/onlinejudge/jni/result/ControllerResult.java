package com.cqjtu.ets.onlinejudge.jni.result;

import com.cqjtu.ets.onlinejudge.jni.datastructure.ResourceLimit;

public class ControllerResult {
    /**
     * -1: ERROR 用来指示Java后端代码内部错误而非JNI的SE程序错误
     * 0: OK
     * 1: SE
     * 2: CLE, //Cpu Time Limited Error
     * 3: RLE, //Real Time Limited Error
     * 4: MLE, //Memory Limited Error
     * 5: OLE, //Output Limited Error, 输出文件的数据过大
     * 6: RE, //Runtime Error
     */
    int status=-1;
    int returnValue;
    ResourceLimit usedResourceLimit; //程序实际所用资源
    String errorStr; // 返回给前台的错误信息

    public ControllerResult(){
        usedResourceLimit = new ResourceLimit();
    }

    public String getErrorStr() {
        return errorStr;
    }

    public void setErrorStr(String errorStr) {
        this.errorStr = errorStr;
    }

    @Override
    public String toString() {
        return "ControllerResult{" +
                "status=" + status +
                ", returnValue=" + returnValue +
                ", usedResourceLimit=" + usedResourceLimit +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(int returnValue) {
        this.returnValue = returnValue;
    }

    public ResourceLimit getUsedResourceLimit() {
        return usedResourceLimit;
    }

    public void setUsedResourceLimit(ResourceLimit usedResourceLimit) {
        this.usedResourceLimit = usedResourceLimit;
    }
}
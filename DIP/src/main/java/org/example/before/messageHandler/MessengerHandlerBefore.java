package org.example.before.messageHandler;

import java.lang.reflect.Method;

public class MessengerHandlerBefore {

    private String chanel;

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel;
    }

    public void sendToken() throws Exception {
        String classe = "org.example.before.messages." + this.getChanel().substring(0, 1).toUpperCase() + this.getChanel().substring(1);
        Object obj = Class.forName(classe).newInstance(); //Quando usa o new, você fica dependente e acoplado a essa classe
        Method method = obj.getClass().getMethod("send");
        method.invoke(obj);
    }
}

package org.apache.ibatis.kimi;
/**
* @author donglongjun
* @date 2018年12月18日 下午6:12:53
*/
public class Reserver {
    
    int id;
    
    String user_name;
    
    String user_phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    @Override
    public String toString() {
        return "Reserver{" +
                "id=" + id +
                ",userName=" + user_name +
                ",userPhone" + user_phone;
    }

}

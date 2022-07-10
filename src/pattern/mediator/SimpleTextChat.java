package pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{
    Admin admin;
    List<User> userList = new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public void addUserToChat(User user){
        userList.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u: userList) {
            if(u!=user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}

package thanhdnh.ueh.edu.article_app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class UserList {

  @SerializedName("users")
  @Expose
  private ArrayList<UserProfile> userProfiles;

  public UserList(ArrayList<UserProfile> userProfiles) {
    this.setUserProfiles(userProfiles);
  }

  public ArrayList<UserProfile> getUserProfiles() {
    return userProfiles;
  }

  public void setUserProfiles(ArrayList<UserProfile> userProfiles) {
    this.userProfiles = userProfiles;
  }
}

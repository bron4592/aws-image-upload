package com.bron4592.awsimageunload.datastore;

import com.bron4592.awsimageunload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    public static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("2688450c-cfaa-4e68-92a3-252c178e87ec"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("3a40f168-13a7-48e6-bd7e-605859033145"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}

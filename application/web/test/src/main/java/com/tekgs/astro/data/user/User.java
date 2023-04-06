package com.tekgs.astro.data.user;
@SuppressWarnings("unused") //  Gson is used to populate the fields
public class User implements UserCalibratable {
    private String username;
    private String password;
    private static boolean areEquivalent(Object comparatorValue, Object thisValue) {
        return comparatorValue == null || thisValue.equals(comparatorValue);
    }

    public boolean equivalent(UserCalibratable comparator) {
        if (comparator == null) {
            return false;
        } else if (this.getUsername().equals(comparator.getUsername())) {
            return true;
        }
        return areEquivalent(comparator.getPassword(), this.getPassword());
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

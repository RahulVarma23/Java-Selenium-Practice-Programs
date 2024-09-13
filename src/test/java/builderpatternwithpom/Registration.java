package builderpatternwithpom;

public class Registration {
    public String firstName;
    public String lastName;
    public String email;
    public String telephone;
    public String password;
    public String confirmPassword;

    public Registration(RegistrationBuilder registrationBuilder) {
        this.firstName=registrationBuilder.firstName;
        this.lastName=registrationBuilder.lastName;
        this.email=registrationBuilder.email;
        this.telephone=registrationBuilder.telephone;
        this.password=registrationBuilder.password;
        this.confirmPassword=registrationBuilder.confirmPassword;
    }

    public static class RegistrationBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String telephone;
        private String password;
        private String confirmPassword;


         RegistrationBuilder setFirstName(String firstName) {
            this.firstName=firstName;
            return this;
        }

        RegistrationBuilder setLastName(String lastName) {
            this.lastName=lastName;
            return this;
        }

        RegistrationBuilder setEmail(String email) {
            this.email=email;
            return this;
        }

        RegistrationBuilder setTelephone(String telephone) {
            this.telephone=telephone;
            return this;
        }

        RegistrationBuilder setPassword(String password) {
            this.password=password;
            return this;
        }

        RegistrationBuilder setConfirmPassword(String confirmPassword) {
            this.confirmPassword=confirmPassword;
            return this;
        }

        public Registration build() {
             return new Registration(this);
        }
    }
}

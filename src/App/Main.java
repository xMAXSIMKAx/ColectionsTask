package App;

import App.Functional.UserFunctions;
import App.UserView.UserViewFunctional;

public class Main {
    public static void main(String[] args) {
        UserViewFunctional userViewFunctional = new UserViewFunctional(new UserFunctions());
        userViewFunctional.executeFunctionality();
    }
}

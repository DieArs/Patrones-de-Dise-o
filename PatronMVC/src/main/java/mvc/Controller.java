package mvc;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void updateName(String name){
        model.setName(name);
    }
    public void updateAge(int age){
        model.setAge(age);
    }
    public void updateView(){
        view.displayUser(model.getName(), model.getAge());
    }
}


package mvc;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest extends TestCase {
    private Model model;
    private View view;
    private Controller controller;

    public void setUp() throws Exception {
        model = new Model();
        view = new View();
        controller = new Controller(model, view);
    }

    public void testUpdateName() {
        controller.updateName("Alejandro Segura");
        assertEquals("Alejandro Segura", model.getName());
    }

    public void testUpdateAge() {
        controller.updateAge(30);
        assertEquals(30, model.getAge());

    }

}
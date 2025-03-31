import java.awt.*;

public class Main extends Frame {
  Main() {
    setSize(500, 500);
    setLayout(new FlowLayout());

    add(new Button("Hello World"));

    setVisible(true);
  }

  public static void main(String args[]) {
    new Main();
  }
}

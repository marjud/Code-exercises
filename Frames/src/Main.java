import java.awt.*;

public class Main {

	public static void main(String[] args) {
		
		Frame f = new Frame("QA Learning Academy");
		TextField t1 = new TextField();
		EventHandler e = new EventHandler(t1);
		
		Button bn = new Button("north button");
		Button be = new Button("east button");
		Button bs = new Button("south button");
		Button bw = new Button("west button");
		Button bc = new Button("centre button");
		f.add(t1, BorderLayout.SOUTH);
		f.add(bn, BorderLayout.NORTH);
		f.add(be, BorderLayout.EAST);
		//f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(bc, BorderLayout.CENTER);
		bn.addActionListener(e);
		//bc.addActionListener(e -> test());
		f.setSize(800, 800);
		f.setVisible(true);

	}
	
	public static void test() {
		System.out.println("test");
	}
}

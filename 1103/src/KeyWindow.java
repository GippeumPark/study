import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class KeyWindow extends Frame {

//화면에 필요한 인스턴스의 변수 선언
	Label lbl;
	
//생성자
	public KeyWindow() {
		setLayout(null); //null로 할 경우 마음대로 배치할 수 있음
		
		lbl = new Label("@");
		lbl.setBounds(100,100,20,20);
		add(lbl);
		
		setTitle("키보드 이벤트");
		setBounds(300,300,400,400);
		setVisible(true);
		

//마우스 모션이벤트
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent arg0) {
				lbl.setBounds(arg0.getX(), arg0.getY(), 20, 20);
				
			}
			
		});
//마우스이벤트		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.printf("x:%d y:%d\n", e.getX(), e.getY());

//마우스 클릭하는 곳 좌표찍기				
				lbl.setBounds(e.getX(), e.getY(), 20, 20);
			
			}


			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
//키보드이벤트		
		//메소드 생성시 여러 메소드가 나옴
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					int x = lbl.getLocation().x;
					int y = lbl.getLocation().y;
					lbl.setBounds(x, y+5, 20, 20);
				}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					int x = lbl.getLocation().x;
					int y = lbl.getLocation().y;
					lbl.setBounds(x+3, y-2, 30, 10);					
				}else if(e.getKeyCode()==KeyEvent.VK_UP) {
					int x = lbl.getLocation().x;
					int y = lbl.getLocation().y;
					lbl.setBounds(x, y, 40, 30);
				}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					int x = lbl.getLocation().x;
					int y = lbl.getLocation().y;
					lbl.setBounds(x-2, y+3, 10, 30);
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}


			
		});
		
		
		
	}
	
	
}

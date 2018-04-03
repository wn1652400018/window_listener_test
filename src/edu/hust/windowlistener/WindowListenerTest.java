package edu.hust.windowlistener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerTest {
	private Frame f = new Frame("窗口事件监听器");
	private TextArea ta = new TextArea(6,40);
	public void init() {
		f.addWindowListener(new MyWindowListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	
	
	class MyWindowListener implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("窗口被激活。");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("窗口被关闭。");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("用户关闭窗口");
			System.exit(0);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("窗口失去焦点。");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("窗口被恢复");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("窗口被最小化。");
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("窗口被初次打开。");
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowListenerTest().init();
	}
   
}

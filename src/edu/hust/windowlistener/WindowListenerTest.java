package edu.hust.windowlistener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerTest {
	private Frame f = new Frame("�����¼�������");
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
			ta.append("���ڱ����");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("���ڱ��رա�");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("�û��رմ���");
			System.exit(0);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("����ʧȥ���㡣");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("���ڱ��ָ�");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("���ڱ���С����");
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			ta.append("���ڱ����δ򿪡�");
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowListenerTest().init();
	}
   
}

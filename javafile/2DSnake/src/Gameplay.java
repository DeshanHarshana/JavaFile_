import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Gameplay  extends javax.swing.JPanel implements KeyListener, ActionListener {
	private ImageIcon titleImage;
	
	private int[] snakexlength=new int[750];
	private int[] snakeylength=new int[750];
	
	private int[] enemyxpoes= {25,50,75,100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,475,500,525,550,575,600,625,650,675,700,725,750,775,800,825,850};
	private int[] enemyypoes= {75,100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,475,500,525,550,575,600,625};
	
	private boolean left=false;
	private boolean right=false;
	private boolean up=false;
	private boolean down=false;
	
	private ImageIcon rightmouth;
	private ImageIcon leftmouth;
	private ImageIcon upmouth;
	private ImageIcon downmouth;
	private ImageIcon snakeImage;
	private ImageIcon enemy;
	
	private int score;
	
	private Random random=new Random();
	
	private int xpoes=random.nextInt(34);
	private int ypoes=random.nextInt(23);
	
	private int moves=0;
	
	private int lenthofsnake=3;
	
	private Timer timer;
	private int delay=100;
	
	public Gameplay() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer=new Timer(delay, this);
		timer.start();
		
	}
	
	public void paint(Graphics graphics) {
		
		if(moves==0) {
			snakexlength[2]=50;
			snakexlength[1]=75;
			snakexlength[0]=100;
			
			snakeylength[2]=100;
			snakeylength[1]=100;
			snakeylength[0]=100;
		}
		//draw titleImage Border
		graphics.setColor(Color.white);
		graphics.drawRect(24, 10, 851, 55);
		
		// draw the title Image
		titleImage =new ImageIcon("snaketitle.jpg");
		titleImage.paintIcon(this, graphics, 25, 11);
		
		// draw the border for gameplay
		graphics.setColor(Color.white);
		graphics.drawRect(24, 74, 851, 577);
		
		//draw background for the gameplay
		graphics.setColor(Color.black);
		graphics.fillRect(25, 75, 850, 575);
		
		//draw the score
		graphics.setColor(Color.white);
		graphics.setFont(new Font("arial", Font.PLAIN,14));
		graphics.drawString("Score : "+score, 780, 30);
		
		//draw the length of snake
				graphics.setColor(Color.white);
				graphics.setFont(new Font("arial", Font.PLAIN,14));
				graphics.drawString("Length : "+lenthofsnake, 780, 50);
		
		rightmouth=new ImageIcon("rightmouth.png");
		rightmouth.paintIcon(this, graphics, snakexlength[0], snakeylength[0]);
		
		
		for(int a=0; a<lenthofsnake; a++) {
			if(a==0 && right) {
				rightmouth=new ImageIcon("rightmouth.png");
				rightmouth.paintIcon(this, graphics, snakexlength[a], snakeylength[a]);
			}
			
			if(a==0 && left) {
				leftmouth=new ImageIcon("leftmouth.png");
				leftmouth.paintIcon(this, graphics, snakexlength[a], snakeylength[a]);
			}
			
			if(a==0 && up) {
				upmouth=new ImageIcon("upmouth.png");
				upmouth.paintIcon(this, graphics, snakexlength[a], snakeylength[a]);
			}
			
			if(a==0 && down) {
				downmouth=new ImageIcon("downmouth.png");
				downmouth.paintIcon(this, graphics, snakexlength[a], snakeylength[a]);
			}
			
			if(a!=0) {
				snakeImage=new ImageIcon("snakeImage.png");
				snakeImage.paintIcon(this, graphics, snakexlength[a], snakeylength[a]);
			}
		}
		
		enemy=new ImageIcon("enemy.png");
		
		if(enemyxpoes[xpoes]==snakexlength[0] && enemyypoes[ypoes]==snakeylength[0]) {
			score++;
			lenthofsnake++;
			xpoes=random.nextInt(34);
			ypoes=random.nextInt(23);
		}
		enemy.paintIcon(this, graphics, enemyxpoes[xpoes], enemyypoes[ypoes]);
		
		for(int b=1; b<lenthofsnake; b++) {
			if(snakexlength[b]==snakexlength[0] && snakeylength[b]==snakeylength[0]) {
				right=false;
				left=false;
				up=false;
				down=false;
				
				graphics.setColor(Color.white);
				graphics.setFont(new Font("arial", Font.BOLD,50));
				graphics.drawString("GAME OVER", 300, 300);
				
				graphics.setFont(new Font("arial", Font.BOLD,20));
				graphics.drawString("Press space for restart", 350, 340);
				
			}
		}
		
		graphics.dispose();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		timer.start();
		if(right) {
			for(int r=lenthofsnake-1; r>=0; r--) {
				snakeylength[r+1]=snakeylength[r];
			}
			for(int r=lenthofsnake; r>=0; r--) {
				if(r==0) {
					snakexlength[r]=snakexlength[r]+25;
				}
				else {
					snakexlength[r]=snakexlength[r-1];
				}
				if(snakexlength[r]>850) {
					snakexlength[r]=25;
				}
			}
			repaint();
		}
		if(left) {
			for(int r=lenthofsnake-1; r>=0; r--) {
				snakeylength[r+1]=snakeylength[r];
			}
			for(int r=lenthofsnake; r>=0; r--) {
				if(r==0) {
					snakexlength[r]=snakexlength[r]-25;
				}
				else {
					snakexlength[r]=snakexlength[r-1];
				}
				if(snakexlength[r]<25) {
					snakexlength[r]=850;
				}
			}
			repaint();
		}
		if(up) {
			for(int r=lenthofsnake-1; r>=0; r--) {
				snakexlength[r+1]=snakexlength[r];
			}
			for(int r=lenthofsnake; r>=0; r--) {
				if(r==0) {
					snakeylength[r]=snakeylength[r]-25;
				}
				else {
					snakeylength[r]=snakeylength[r-1];
				}
				if(snakeylength[r]<75) {
					snakeylength[r]=625;
				}
			}
			repaint();
}
		if(down) {
			for(int r=lenthofsnake-1; r>=0; r--) {
				snakexlength[r+1]=snakexlength[r];
			}
			for(int r=lenthofsnake; r>=0; r--) {
				if(r==0) {
					snakeylength[r]=snakeylength[r]+25;
				}
				else {
					snakeylength[r]=snakeylength[r-1];
				}
				if(snakeylength[r]>625) {
					snakeylength[r]=75;
				}
			}
			repaint();
}
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode()==KeyEvent.VK_SPACE) {
			moves=0;
			score=0;
			lenthofsnake=3;
			repaint();
			
		}
		
		
		if(arg0.getKeyCode()==KeyEvent.VK_RIGHT) {
			moves++;
			right=true;
			if(!left) {
				right=true;
			}
			else {
				right=false;
				left=true;
			}
			
			up=false;
			down=false;
		}
		
		if(arg0.getKeyCode()==KeyEvent.VK_LEFT) {
			moves++;
			left=true;
			if(!right) {
				left=true;
			}
			else {
				left=false;
				right=true;
			}
			
			up=false;
			down=false;
		}
		
		if(arg0.getKeyCode()==KeyEvent.VK_UP) {
			moves++;
			up=true;
			if(!down) {
				up=true;
			}
			else {
				up=false;
				down=true;
			}
			
			left=false;
			right=false;
		}
		
		if(arg0.getKeyCode()==KeyEvent.VK_DOWN) {
			moves++;
			down=true;
			if(!up) {
				down=true;
			}
			else {
				down=false;
				up=true;
			}
			
			left=false;
			right=false;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

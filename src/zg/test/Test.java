package zg.test;

/**
 * Java虚拟机并发编程
 * Windows Mac上运行不一样：在于有没有运行到 Done!
 * 在上面不同的系统上由于JIT 及时优化技术 致使线程可能没有及时看到done的变化
 */
public class Test {
	private static boolean done;
	
	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable(){
			@Override
			public void run() {
				int i=0;
				while(!done){
					i++;
				}
				System.out.println("Done!");
			}
		}).start();
		
		System.out.println("OS:"+System.getProperty("os.name"));
		Thread.sleep(2000);
		done=true;
		System.out.println("flag done set to true");
	}
}

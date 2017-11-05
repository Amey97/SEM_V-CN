import java.io.*;
import java.util.*;
	public class go_back_n {

		public static void main(String args[]) throws IOException
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter the Window Size: "); //Taking the size of window i.e the length of trasmission
			int window = sc.nextInt();

			boolean loop = true;
			int sent = 1;

			while(loop)
			{	

				for(int i = 0; i < window; i++)
				{
					System.out.println("Frame " + sent + " has been transmitted.");
					sent++;
					if(sent == window)
						break;
				}
				System.out.println("Enter 0 if frame is damaged or Enter 1 if data received successfully");
				int ch=sc.nextInt();
				if(ch==0) {
					System.out.println("which frame is damaged:");
					int ack = sc.nextInt();
					
					System.out.println(" the Negative Acknowledgement received (NACK):"+ack);
					sent = ack;
				}
				else if(ch==1){
					System.out.println("you r out");
					loop=false;
				}
				
			}

		}

	}


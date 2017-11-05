import java.io.*;	
import java.util.*;
	public class selective {

		public static void main(String args[]) throws IOException
		{

			Scanner sc=new Scanner(System.in);

			System.out.print("Please enter the Window Size: "); 
			int window = sc.nextInt();
			int ack=0;
			boolean loop = true;
			int sent = 1;
			while(loop)
			{	

				for(int i = 0; i < window; i++)
				{
					System.out.println("Frame " + sent + " has been transmitted.");
					if(sent == window || sent == ack)
						break;
					sent++;

				}
				System.out.println("Enter 0 if frame is damaged or Enter 1 if data received successfully");
				int ch=sc.nextInt();
				if(ch==0) {
					System.out.println("which frame is damaged:");
					ack= sc.nextInt();
					
					System.out.println(" the Negative Acknowledgement received (NACK):"+ack);
					sent = ack;
				}
				else{
					System.out.println("you r out");
					loop=false;
				}

			}

		}

	}

import java.util.Scanner;

public class TweetDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";
		int counter = 0;

      System.out.println("Enter a tweet or abbreviation from tweet: ");
      
		
    	  origTweet = scnr.nextLine();
    	  if (origTweet.length() <= 140){
   
    	  }
		  else
		  {
    		System.out.println("Tweet is too long make it shorter");
    		  }
			 
			  

          if (origTweet.equals("LOL")) {
         System.out.println("LOL = laughing out loud");
      }
      else if (origTweet.equals("BFN")) {
         System.out.println("BFN = bye for now");
      }
      else if (origTweet.equals("FTW")) {
         System.out.println("FTW = for the win");
      }
      else if (origTweet.equals("IRL")) {
         System.out.println("IRL = in real life");
      }
      else if (origTweet.equals("TTYL")) {
         System.out.println("TTYL = talk to you later");
         }
         else if (origTweet.equals("G2G")) {
         System.out.println("G2G = got to go");
         }
         
         else if (origTweet.equals("bfn")) {
         System.out.println("Did you mean BFN?" +'\n' +"BFN = bye for now");
      }
      else if (origTweet.equals("ftw")) {
         System.out.println("Did you mean FTW?" +'\n' +"FTW = for the win");
      }
      else if (origTweet.equals("irl")) {
         System.out.println("Did you mean IRL?" +'\n' +"IRL = in real life");
      }
      else if (origTweet.equals("ttyl")) {
         System.out.println("Did you mean TTYL?" +'\n' +"TTYL = talk to you later");
         }
         else if (origTweet.equals("g2g")) {
         System.out.println("Did you mean G2G?" +'\n' +"G2G = got to go");
         }
         else if (origTweet.equals("lol")) {
         System.out.println("Did you mean LOL?" +'\n' +"LOL = laughing out loud");
         }
					

			System.out.println("Abrevations used in Tweet");
			 
			  if (origTweet.contains("LOL")) {
         System.out.println("LOL = laughing out loud");
			origTweet = origTweet.replace("LOL", "laughing out loud");

		    	 
      }
		 if (origTweet.contains("lol")) {
         System.out.println("LOL = laughing out loud");
			origTweet = origTweet.replace("lol", "laughing out loud");
      }
	 if (origTweet.contains("BFN")) {
         System.out.println("BFN = bye for now");
				origTweet = origTweet.replace("BFN", "bye for now");
      }
		 if (origTweet.contains("bfn")) {
         System.out.println("BFN = bye for now");
			origTweet = origTweet.replace("bfn", "bye for now");
      }

       if (origTweet.contains("FTW")) {
         System.out.println("FTW = for the win");
			origTweet = origTweet.replace("FTW", "for the win");
      }
		
	 if (origTweet.contains("ftw")) {
         System.out.println("FTW = for the win");
			origTweet = origTweet.replace("ftw", "for the win");
      }

       if (origTweet.contains("IRL")) {
         System.out.println("IRL = in real life");
			origTweet = origTweet.replace("IRL", "in real life");
      }
		
	 if (origTweet.contains("irl")) {
         System.out.println("IRL = in real life");
			origTweet = origTweet.replace("irl", "in real life");
      }

       if (origTweet.contains("TTYL")) {
         System.out.println("TTYL = talk to you later");
			origTweet = origTweet.replace("TTYL", "talk to you later");
         }
				 if (origTweet.contains("ttyl")) {
         System.out.println("TTYL = talk to you later");
			origTweet = origTweet.replace("ttyl", "talk to you later");
      }

          if (origTweet.contains("G2G")) {
         System.out.println("G2G = got to go");
			origTweet = origTweet.replace("G2G", "got to go");
         }
				 if (origTweet.contains("g2g")) {
         System.out.println("G2G = got to go");
			origTweet = origTweet.replace("g2g", "got to go");
      }
				
				else {
				System.out.println("Decoded Message");
			System.out.println(origTweet);
        			
      }

         




      
      return;
   }
}

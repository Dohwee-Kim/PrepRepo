#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Solution{
public:
	static int Longestsub(char s[] ){
		int ASCIIset[256];
		int strLength = strlen(s); // check the length of the input string 

		if (strLength == 0){       // if it has 0 size 
			return strLength;
		}
		else {
			for (int i = 0; i<256 ; i++)
				ASCIIset[i] =-1;   // set all ASCII position as -1

			vector<int> dp(strLength,1); // initialize vector with size string length 
			
			int max = 1;
			int currentMin = 1;
			int currentASCII = s[0];

			ASCIIset[s[0]]=0;	//first char 
			//cout<<"input:"<<ASCIIset[s[0]]<<ASCIIset[97]<<endl;
			for (int j=1; j< strLength; j++){
				//int min = dp[j-1] +1;
				if ( ASCIIset[s[j]] < 0) {  //if that char already used ! 
					if( currentASCII == s[j])	// case for repeating 
						currentMin += 1;
					else                        // case for different cha
					{
						currentASCII = s[j];
						currentMin = 1;
						ASCIIset[s[j-1]] = -1;	// reset parameters 
					}

				}
				else if (ASCIIset[s[j]] >= 0)
					//if ( j - ASCIIset[s[j]] < min) min = j - ASCIIset[s[j]];
					currentMin+=1;
					if (currentMin > max) max = currentMin;
				//ASCIIset[s[j]] = j;
				//dp[j] = min;
			}

			return max;
		}

	}
};

int main(int argc, char argv[]){
	static char testString[10]= "aabcccdef";
	int result;
	cout<<testString<<endl<<"now finding..."<<endl;

	result = Solution::Longestsub(testString);
	cout<<result<<endl;


	return 0;
}
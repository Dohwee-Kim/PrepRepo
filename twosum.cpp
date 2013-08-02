#include <iostream>
#include <vector> 


static class solution{
public:
	// public function for vector 
	std::vector<int> static twoSum(std::vector<int> &numbers, int target)
	{
		int i,j;
		int size = numbers.size(); 
		
		std::vector<int> result; 
		//std::vector<int> itr1,itr2;


		for(i = 0; i< size-1; i++)
			for ( j= i+1 ; j < size ; j++)
				if(numbers[i] + numbers[j] == target)
				{
					result.push_back(i+1);
					result.push_back(j+1);
					return result;
				}
	}	
};
	
int main (int argc, char *argv[])
{
	std::vector<int> ss; 

	//int input = std::atoi(argv[1]);
	std::vector<int> inputnumbers;
	inputnumbers.push_back(2);
	inputnumbers.push_back(7);
	inputnumbers.push_back(11);
	inputnumbers.push_back(15);

	int tgt = 9;

	std::cout<<"input with:"<<std::endl;
	std::vector<int> resultvec = solution::twoSum(inputnumbers, tgt);

	std::vector<int>::iterator itr; 
	for( itr = resultvec.begin() ; itr!= resultvec.end() ; itr++)
		std::cout<< *itr << std::endl; 


	return 0;
}
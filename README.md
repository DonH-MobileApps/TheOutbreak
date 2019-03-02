Fill in the logic for the isOutbreak() method. This method should return true if 5 or more connected rooms are infected, false otherwise. Connected rooms are defined as rooms that share a wall, e.g. diagonal rooms are not connected. You may write any helper functions you wish.
  {
public final boolean isInfected; public boolean visited = false;
Outbreak |X|X|X|||||||| |||X|X||||||| ||||||||||| ||||||||||| ||||||||||| ||||||||||| ||||||||||| ||||||||||| ||||||||||| |||||||||||
No Outbreak ||X|||| |||X||| ||||X|| |||||X| ||||||X||||| ||||||||||| ||||||||||| ||||||||||| ||||||||||| |||||||||||


The Josephus Problem is a famous mathematical puzzle that goes back to ancient times. There are many stories to go with the puzzle.
One is that Josephus was one of a group of Jews who were about to be captured by the Romans. Rather than be enslaved, they chose to commit suicide. They arranged themselves in a circle and, starting at a certain person, started counting off around the circle. Every nth person had to leave the circle and commit suicide.

Josephus decided he didn’t want to die, so he arranged the rules so he would be the last person left. The problem is made much more complicated because the circle shrinks as the counting continues.

Create an application that uses a circular linked list to model this problem. Inputs are the number of people in the circle, the number used for counting off, and the number of the person where counting starts (usually 1). The output is the list of persons being eliminated. When a person drops out of the circle, counting starts again from the person who was on his left (assuming you go around clockwise). 

Here’s an example.
There are seven people numbered 1 through 7, and you start at 1 and count off by threes. People will be eliminated in the order 4, 1, 6, 5, 7, 3. Number 2 will be left.

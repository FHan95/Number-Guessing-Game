'''
A simple game.

The user is asked for a name, and whether or not they want to play the game.
The game requires the user to guess a number between 1 to 10. It records the number of attempts made.
When the correct number is guessed, the program congratulates the user and displays the number of attempts made.

@author: Felix
'''

import random
import sys

#Get the user's name
name = raw_input("Please enter a name.\n")
print "Hello " + name

#Asks the user if they would like to play the game
answer = raw_input("Would you like to play a guessing game? (Y/N)\n")

#Recursively asks the user for a valid response
while answer.lower() != "n" and answer.lower() != "no" and answer.lower() != "y" and answer.lower() != "yes":
    answer = raw_input("Please enter a valid response.\nWould you like to play a guessing game? (Y/N)\n")

#Exits the game given the user replied no
if answer.lower() == "n" or answer.lower() == "no":
    sys.exit()

number = random.randint(1, 10)
attempts = 1
guess = input("I am thinking of a number between 1 and 10. What is your guess?\n")

#Hints for the user's next guess
while guess != number:
    if guess < number:
        guess = input("Try a number that is higher.\n")
    if guess > number:
        guess = input("Try a number that is lower\n")
    attempts += 1

#Given that the user guessed the correct number
if guess == number:
    if attempts == 1:
        print "Congrats! The number was " + str(number) + ". You made " + str(attempts) + " attempt\n"
    else:
        print "Congrats! The number was " + str(number) + ". You made " + str(attempts) + " attempts\n"

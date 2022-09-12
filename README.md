# BlackjackProject

## Description
This Blackjack program offers users a simple interface to hit or stand against their dealer. Upon starting each round, the deck is shuffled and cards are dealt to each player. These cards are removed from the deck to prevent duplication. 
Cards are immediately evaluated for Blackjack. Then the player has a the option to hit or stand. If the player doesn't bust, the dealer will try to beat their hand. Ties are pushed and the deck is replenished upon restart. 

## Technologies Used
The cards are built using the enum class that represents the constant card numbers and suits. The numbers and suits are assigned to a deck with a nested for each loop. These cards are instantiated in the deck class. There are two parent/child inheritance structures. The Blackjack hand extends the hand class,
taking an empty ArrayList and adding the method to return hand value. Dealer extends player, allowing the dealer unique behaviors in the form of dealing cards, showing cards, and importantly, controlling the deck of cards.
The balance of the application relies on boolean logic to progress through the player and dealer turns, making use of a do/while loop to ensure appropriate user input and evaluation of completed steps. Finally, the logic was refactored and couched within the playingBlackjack and run to allow for
readability and simple editing. For example, issues with dealer output can be resolved in the associated method. 

## Lessons Learned
I increased my understanding of inheritance through the parent child relationships. As I wrote the program, I moved logic from various classes to the application and back again. Refactoring helped me organize my code and made editing the output much easier. I was able to use inheritance, like super(), to pass
required objects between the classes. Dot notation was more abstract with this project, and I will spend more time wrangling this code in the future. 
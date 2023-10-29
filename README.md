# BlackjackProject

# Description

This project is a simulation of the popular game named Blackjack. It deals within a standardized deck of 52 cards and leaves the luck up to fate. 

# Technologies Used

Java, OOP, Eclipse

# Lessons Learned

With this project, I gained a better understanding of visibility between classes and packages as well as making methods to do one thing well.

The main issue I was having while coding this project was trying to place a card into the Player's hand. In the first attempt, I was using the player to do it, which would not be realistic in a real game as the dealer is the one who deals. The second attempt was using the dealer, but I found I was actually creating a separate hand for the player inside of the dealer class, which wouldn't work as well.

It took using a mutually accessible method that took in the parameter of `Player player` to obtain the desired result. This worked because the `Dealer` is a `Player`. Thus I was able to use both depending on the method I wanted to call.




# How To Use

This project only requires the user to make one of two inputs.

Once you run the program, the dealer will give out two hands of cards, one to himself, and the other to the user(Player).

When you are given your cards and value, you can choose to Hit or Stand. Hit will deal you an additional card and Stand will keep your current value.

The winner is the closest value to 21. If you hit 21, you win, if you go over, you lose.

Have fun!
- Parris



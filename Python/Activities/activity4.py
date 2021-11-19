player1=input("Player1 name=")
player2=input("Player2 name=")
	
p1_answer = input(player1 + ", do you want to choose rock, paper or scissors? ").lower()
p2_answer = input(player2 + ", do you want to choose rock, paper or scissors? ").lower()
 
if(p1_answer not in("rock,paper,scissors") or p2_answer not in("rock,paper,scissors")):
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
if p1_answer == p2_answer:
    print("It's a tie!")
elif p1_answer == 'rock':
    if p2_answer == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif p1_answer == 'scissors':
    if p2_answer == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif p1_answer == 'paper':
    if p2_answer == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")

gameContinue=input("Do ypu want to continue the game? Yes/No")

if(gameContinue=="Yes" or gameContinue=="yes" or gameContinue=="y"):
    pass
elif(gameContinue=="No" or gameContinue=="no" or gameContinue=="n"):
    raise SystemExit
else:
    print("Enter valid input!!!")
    raise SystemExit
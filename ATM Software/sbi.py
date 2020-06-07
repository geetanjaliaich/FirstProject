class ATM:
    pin = None
    balance = 0

    def __init__(self):

        print("Hello, welcome to SBI ATM:")
        print("Enter pin: ")
        self.pin = input()
        print("Pin entered successfully!")
        balance = 0

    def check_balance(self):
        user_input = input("PIN: ")
        if user_input == self.pin:
            print("Your current balance is: ", self.balance)
        else:
            print("INCORRECT PIN")

    def withdraw(self):
        user_input = input("Enter your pin: ")
        if user_input == self.pin:
            amount = int(input("Enter the amount to be withdrawn: "))
            if amount<=self.balance:
                self.balance = self.balance - amount
            else:
                print("Not Available!")
        else:
            print("Incorrect pin")

    def deposit(self):
        user_input = input("Enter your pin")
        if user_input == self.pin:
            amount = int(input("Enter Amount: "))
            self.balance = self.balance + amount
            print("Deposit Successful! ")
        else:
            print("Incorrect Pin!")
#include <stdio.h>
#include <math.h>


int main()
{
    int number, index = 0, reverseIndex, remainder, digitCount = 0,
    palindromeCount = 0, nonPalindromeCount = 0;
    int digits[10];


    printf("Enter any number: ");
    scanf("%d", &number);

    // Extract digits and store them in an array
    while (number > 0)
    {
        remainder = number % 10;
        number = number / 10;
        digits[index] = remainder;
        index++;
        digitCount++;
    }

    // Check if the number is a palindrome
    for (index = 0; index < digitCount; index++)
    {
        reverseIndex = digitCount - 1 - index;
        if (digits[index] == digits[reverseIndex])
        {
            palindromeCount++;
        }
        else
        {
            nonPalindromeCount++;
        }
    }

    // Output the result
    if (palindromeCount == digitCount && nonPalindromeCount == 0)
    {
        printf("The entered number is a palindrome number.\n");
    }
    else
    {
        printf("The entered number is not a palindrome number.\n");
    }

    return 0;
}

#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{

    printf("Enter any string: ");

    char String[1000];
    scanf("%s", String);

    int length = strlen(String);

    for(int i=0;i<length;i++)
    {
        String[i]=tolower(String[i]);//converting all char to lower chase character
    }


    for (int i = 0; i < length; i++)
    {
        // Compare the current character with the rest of the characters
        for (int j = i + 1; j < length; j++)
        {
            // If a duplicate character is found
            if (String[i] == String[j])
            {
                // Replace the duplicate character with the last character
                String[j] = String[length - 1];
                // Decrease the length of the string
                length--;
                // Adjust the index to check the new character at this position
                j--;
            }
        }
    }

    // Null-terminate the modified string
    String[length] = '\0';

    printf("Modified string: %s\n", String);

    return 0;
}


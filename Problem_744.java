class Problem_744 {
  //approach 1 O(n)
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i]) {
                return letters[i];
            }
        }
        return letters[0];
    }

  /*
approach 2 using binary search o(log n)
  */

  /*
  public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If left goes out of bounds, wrap around
        return left < letters.length ? letters[left] : letters[0];
    }
  */
    public static void main(String args[]) {
        Problem_744 p1 = new Problem_744();

        char letters[] = {'c', 'f', 'j'};
        char target = 'a';              

        System.out.println(p1.nextGreatestLetter(letters, target));
    }
}

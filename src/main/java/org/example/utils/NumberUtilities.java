package org.example.utils;

public class NumberUtilities {

    public static void main(String [] args) {
        int[] testnums = {32, 32, 34, 56, 90, 87};
        int[] finalnums = deduplicate(testnums);
        for (int i = 0; i < finalnums.length; i++) {
            System.out.println("This " + i + "Contains " + finalnums[i]);
        }
    }

    public static int[] deduplicate (int[] nums) {
        int[] filt = new int [0];
        for (int i = 0; i < nums.length; i++) {
          int currentnumber = nums[i];
          boolean false1 = false;
          for(int j = 0; j < filt.length; j++) {
          if (currentnumber == filt[j]) {
              false1 = true;

          }
          }
          if (false1 == false) {
              int[] newnums = new int [filt.length + 1];
              for (int k = 0; k < filt.length; k++) {
                  newnums[k] = filt[k];
              }
              newnums[newnums.length -1] = currentnumber;
              filt = newnums;
          }

        }
        return filt;
    }


}

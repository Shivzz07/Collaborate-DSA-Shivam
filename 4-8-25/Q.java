// Earliest Finish Time for Land and Water Rides I

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int l=landStartTime.length;
        int w = waterStartTime.length;
        
        int min = Integer.MAX_VALUE;
        
            
            for(int i=0;i<l;i++)
                {
                    int sum = landStartTime[i] + landDuration[i];
                    for(int j=0;j<w;j++)
                        {
                            if(sum>=waterStartTime[j])
                            {
                                min = Math.min(min,sum+waterDuration[j]);
                            }
                            else
                            {
                                min = Math.min(min,waterStartTime[j]+waterDuration[j]);
                            }
                        }
                }
            for(int i=0;i<w;i++)
                {
                    int sum = waterStartTime[i] + waterDuration[i];
                    for(int j=0;j<l;j++)
                        {
                            if(sum>=landStartTime[j])
                            {
                                min = Math.min(min,sum+landDuration[j]);
                            }
                            else
                            {
                                min = Math.min(min,landStartTime[j]+landDuration[j]);
                            }
                        }
                }
            
        
        return min;
    }
}
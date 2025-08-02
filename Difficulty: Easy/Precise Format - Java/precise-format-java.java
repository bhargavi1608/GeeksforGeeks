class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> result = new ArrayList<>();
        float value = a/b;
        result.add(value);
        result.add(Math.round(value*1000.0f)/1000.0f);
        return result;
    }
}
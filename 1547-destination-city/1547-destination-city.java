class Solution {
    public String destCity(List<List<String>> paths) {

        List<String> start = new ArrayList<>();

        for(List<String> city : paths){
            start.add(city.get(0));
        }


        for(List<String> city : paths){
            String dest = city.get(1);
            if(!start.contains(dest)){
                return dest;
            }
        }
        return "";

        // List<String> start = new ArrayList<>();
        // List<String> destination = new ArrayList<>();

        // for(List<String> city : paths){
        //     for(int i = 0; i < city.size(); i++){
        //         if(i==0){
        //             start.add(city.get(i));
        //         }
        //         else{
        //             destination.add(city.get(i));
        //         }
        //     }
        // }

        // String dest = new String();
        // for(int i = 0; i < destination.size(); i++){
        //     if(!start.contains(destination.get(i))){
        //         dest = destination.get(i);
        //         break;
        //     }
        // }


        // return dest;
    }
}
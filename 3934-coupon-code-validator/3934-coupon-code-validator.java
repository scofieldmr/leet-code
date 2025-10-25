class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        if (code.length != businessLine.length || businessLine.length != isActive.length) {
            return new ArrayList<>();
        }

      
        List<String> list = new ArrayList<>();

        Map<String, List<String>> map = new TreeMap<>();


        for(int i=0;i<code.length;i++){
            if(isActive[i] &&
                    (businessLine[i].equals("electronics")||
                    businessLine[i].equals("pharmacy")||
                    businessLine[i].equals("restaurant")||
                    businessLine[i].equals("grocery")) ){
                if(!code[i].isEmpty() && code[i].matches("^[A-Za-z0-9_]+$")){
                    map.computeIfAbsent(businessLine[i], k -> new ArrayList<>()).add(code[i]);
                }
            }
        }

        map.entrySet().stream().sorted();

        for(List<String> entry : map.values()){
            if(!entry.isEmpty()){
                entry.sort(String::compareTo);
                list.addAll(entry);
            }
        }

        return list;

        // if(code.length!=businessLine.length && businessLine.length!=isActive.length){
        //     return new ArrayList<>();
        // }
        //  List<String> list = new ArrayList<>();

        // Map<String, String> map = new TreeMap<>();


        // for(int i=0;i<code.length;i++){
        //     if(isActive[i] &&
        //             (businessLine[i].equals("electronics")||
        //             businessLine[i].equals("pharmacy")||
        //             businessLine[i].equals("restaurant")||
        //             businessLine[i].equals("grocery") )){
        //         if(!code[i].isEmpty() && code[i].matches("^[A-Za-z0-9_]+$")){
        //             map.put(businessLine[i],code[i]);
        //         }
        //     }
        // }

        // list.addAll(map.values());

        // return list;
    }
}
// When a contiguous block of text is selected in a PDF viewer,
//  the selection is highlighted with a blue rectangle. 
//  In this PDF viewer, each word is highlighted independently.


public static int designerPdfViewer(List<Integer> h, String word) {
    
    int width = word.length();
    int height = 1;
    for(int i=0;i<word.length();i++){
        int heightOfEachChar = h.get(word.charAt(i)-'a');
        height = Math.max(height, heightOfEachChar);
    }
    return width*height;

    }
// Wait until the DOM is fully loaded
document.addEventListener("DOMContentLoaded", function() {
    // Change content of an element
    document.getElementById("changeContentBtn").addEventListener("click", function() {
        document.getElementById("content").innerHTML = "The Document Object Model (DOM) is a programming interface for web documents. It represents the structure of a document as a tree of objects, where each object corresponds to a part of the document, such as elements, attributes, and text. JavaScript can manipulate this tree structure, allowing developers to dynamically alter the content and appearance of a webpage!";
    });

    // Toggle visibility of an element
    document.getElementById("toggleVisibilityBtn").addEventListener("click", function() {
        var contentElement = document.getElementById("content");
        if (contentElement.classList.contains("hidden")) {
            contentElement.classList.remove("hidden");
        } else {
            contentElement.classList.add("hidden");
        }
    });

    // Highlight an element
    document.getElementById("highlightBtn").addEventListener("click", function() {
        document.getElementById("content").classList.toggle("highlight");
    });
});

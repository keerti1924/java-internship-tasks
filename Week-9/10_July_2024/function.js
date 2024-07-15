function getUserAccess(role, resource){
    switch(role){
        case "admin":
            return "Full Access";
        case "editor":
            switch(resource){
                case "article":
                    return "Article Edit Access";
                case "video":
                    return "Video Edit Access";
                default:
                    return "Limited Access";
            }
        case "viewer":  
            return "Article & Video View Access";
        default:
            return "Invalid Role";
    }
}

console.log(getUserAccess('admin','article'));
console.log(getUserAccess('editor','article'));
console.log(getUserAccess('editor','video'));
console.log(getUserAccess('editor','podcast'));
console.log(getUserAccess('admin','podcast'));
console.log(getUserAccess('viewer','video'));
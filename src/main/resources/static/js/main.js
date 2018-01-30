function change_width(img_name, wid, hei) {
    var CurImage = new Image();
    if (CurImage.src != img_name.src) {
        CurImage.src = img_name.src;
    }
    var img_width = CurImage.width;
    var img_height = CurImage.height;

    img_name.width = img_width;
    img_name.height = img_height;

    if (img_height / hei > img_width / wid) {
        if (img_height > hei) {
            img_name.width = img_width / img_height * hei;
            img_name.height = hei;
        }
    }
    else {
        if (img_width > wid) {
            img_name.height = img_height / img_width * wid;
            img_name.width = wid;
        }
    }

    return true;
}
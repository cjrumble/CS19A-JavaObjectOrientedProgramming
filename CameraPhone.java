// CSCI-19A Object-Oriented Programming
// ASSIGN 6 Overriding Superclass Methods Problem 2
// 2025/08/02 CRUMBLE

/* Assume the existence ot a Phone class with a method, clear, that clears the phone's memory-- its phone book, list ot call, text messages, etc. Assume also, a subclass CameraPhone with an instance variable, album, of type PhotoAlbum-- which has a method, also called clear that clears its contents.
Override the clear method in CameraPhone to clear the entire phone, i.e., to invoke the clear method of Phone (the superclass), as well as invoking the clear method of the album instance
variable */
public class CameraPhone extends Phone {
    private PhotoAlbum album;

    public CameraPhone() {
        super();
        this.album = new PhotoAlbum();
    }

    @Override
    public void clear() {
        // First, clear the phone's memory
        super.clear();

        // Then, clear the photo album
        if (album != null) {
            album.clear();
        }
    }
}

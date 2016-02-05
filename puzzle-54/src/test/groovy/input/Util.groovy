package input


class Util {
    File getFileFromResource(String resource) {
        new File(getClass().getClassLoader().getResource(resource).getFile())
    }
}

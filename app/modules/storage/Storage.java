package modules.storage;

import play.libs.F;
import play.mvc.Result;

import java.nio.file.Path;

public interface Storage {
    /**
     * Stores a file
     *
     * @param   file
     *          The file to store
     * @param   key
     *          A key for the stored file
     */
    F.Promise<Void> store (Path file, String key);

    /**
     * Gets a download for a stored file
     *
     * @param   key
     *          The stored file key
     * @param   name
     *          The name for the file
     */
    F.Promise<Result> getDownload (String key, String name);

    /**
     * Deletes a stored file
     *
     * @param   key
     *          The stored file key
     */
    F.Promise<Void> delete (String key);
}

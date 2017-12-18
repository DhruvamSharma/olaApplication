package dhruvam.olaapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ritvik on 16-12-2017.
 */

public class SongListResponse {

        @SerializedName("page")
        private int page;
        @SerializedName("results")
        private List<Example> results;
        @SerializedName("total_results")
        private int totalResults;
        @SerializedName("total_pages")
        private int totalPages;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public List<Example> getResults() {
            return results;
        }

        public void setResults(List<Example> results) {
            this.results = results;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

}

package Problems;

@RestController
@RequestMapping("/api/products")
public class SearchController {
    
    @Autowired
    private SearchService searchService;
    
    @GetMapping("/search")
    public Collection<ProductItem> search(@RequestParam String query) {
        return searchService.search(query);
    }
}
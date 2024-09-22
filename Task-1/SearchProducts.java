@RestController
@RequestMapping("/api/products")
public class SearchController {
    
    @Autowired
    private ProductItemRepository productItemRepository;
    
    @GetMapping("/search")
    public Collection<ProductItem> search(@RequestParam String query) {
        if (query == null || query.trim().isEmpty()) {
            // Return an empty collection if the search query is empty
            return new ArrayList<>();
        }
        
        // Use the productItemRepository to query the product database
        Collection<ProductItem> results = productItemRepository.findByNameContainingIgnoreCase(query);
        
        if (results == null || results.isEmpty()) {
            // Return an empty collection if no products match the search query
            return new ArrayList<>();
        }
        
        return results;
    }
}
package com.portal.rest.mapper;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @param <S> server object type
 * @param <R> rest object type
 *
 */
public interface RestMapper<S, R>
{
  default S convertToServer(final R object)
  {
    throw new UnsupportedOperationException();
  }

  default List<S> convertToServer(final List<R> objects)
  {
    return objects != null
      ? objects.stream().map(this::convertToServer).collect(Collectors.toList())
      : Collections.emptyList();
  }

  default Set<S> convertToServer(final Set<R> objects)
  {
    return objects != null
      ? objects.stream().map(this::convertToServer).collect(Collectors.toSet())
      : Collections.emptySet();
  }

  R convertToRest(S object);

  default List<R> convertToRest(final List<S> objects)
  {
    return objects != null
      ? objects.stream().map(this::convertToRest).collect(Collectors.toList())
      : Collections.emptyList();
  }

  default Set<R> convertToRest(final Set<S> objects)
  {
    return objects != null
      ? objects.stream().map(this::convertToRest).collect(Collectors.toSet())
      : Collections.emptySet();
  }
}
